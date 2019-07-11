PGDMP     	    5        
        w            examen    10.7    10.7                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            	           1262    25099    examen    DATABASE     �   CREATE DATABASE examen WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United Kingdom.1252' LC_CTYPE = 'English_United Kingdom.1252';
    DROP DATABASE examen;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            
           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    25102    cliente    TABLE     �   CREATE TABLE public.cliente (
    c_cliente integer NOT NULL,
    s_nombre character varying(30),
    s_apellido character varying(30),
    b_activo boolean
);
    DROP TABLE public.cliente;
       public         postgres    false    3            �            1259    25100    cliente_c_cliente_seq    SEQUENCE     �   CREATE SEQUENCE public.cliente_c_cliente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.cliente_c_cliente_seq;
       public       postgres    false    197    3                       0    0    cliente_c_cliente_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.cliente_c_cliente_seq OWNED BY public.cliente.c_cliente;
            public       postgres    false    196            �            1259    25136    compra    TABLE     �   CREATE TABLE public.compra (
    c_orden_compra integer NOT NULL,
    c_producto integer,
    c_cliente integer,
    n_cantidad integer,
    f_compra date,
    n_total numeric(14,2)
);
    DROP TABLE public.compra;
       public         postgres    false    3            �            1259    25134    compra_c_orden_compra_seq    SEQUENCE     �   CREATE SEQUENCE public.compra_c_orden_compra_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.compra_c_orden_compra_seq;
       public       postgres    false    201    3                       0    0    compra_c_orden_compra_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.compra_c_orden_compra_seq OWNED BY public.compra.c_orden_compra;
            public       postgres    false    200            �            1259    25110    producto    TABLE     �   CREATE TABLE public.producto (
    c_producto integer NOT NULL,
    nombre character varying(30),
    descripcion character varying(30),
    inventario integer,
    fecha_ingreso date,
    b_activo boolean,
    n_precio numeric(18,0)
);
    DROP TABLE public.producto;
       public         postgres    false    3            �            1259    25108    producto_c_producto_seq    SEQUENCE     �   CREATE SEQUENCE public.producto_c_producto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.producto_c_producto_seq;
       public       postgres    false    199    3                       0    0    producto_c_producto_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.producto_c_producto_seq OWNED BY public.producto.c_producto;
            public       postgres    false    198            z
           2604    25105    cliente c_cliente    DEFAULT     v   ALTER TABLE ONLY public.cliente ALTER COLUMN c_cliente SET DEFAULT nextval('public.cliente_c_cliente_seq'::regclass);
 @   ALTER TABLE public.cliente ALTER COLUMN c_cliente DROP DEFAULT;
       public       postgres    false    197    196    197            |
           2604    25139    compra c_orden_compra    DEFAULT     ~   ALTER TABLE ONLY public.compra ALTER COLUMN c_orden_compra SET DEFAULT nextval('public.compra_c_orden_compra_seq'::regclass);
 D   ALTER TABLE public.compra ALTER COLUMN c_orden_compra DROP DEFAULT;
       public       postgres    false    201    200    201            {
           2604    25113    producto c_producto    DEFAULT     z   ALTER TABLE ONLY public.producto ALTER COLUMN c_producto SET DEFAULT nextval('public.producto_c_producto_seq'::regclass);
 B   ALTER TABLE public.producto ALTER COLUMN c_producto DROP DEFAULT;
       public       postgres    false    199    198    199            �
          0    25102    cliente 
   TABLE DATA               L   COPY public.cliente (c_cliente, s_nombre, s_apellido, b_activo) FROM stdin;
    public       postgres    false    197   �                  0    25136    compra 
   TABLE DATA               f   COPY public.compra (c_orden_compra, c_producto, c_cliente, n_cantidad, f_compra, n_total) FROM stdin;
    public       postgres    false    201   8!                 0    25110    producto 
   TABLE DATA               r   COPY public.producto (c_producto, nombre, descripcion, inventario, fecha_ingreso, b_activo, n_precio) FROM stdin;
    public       postgres    false    199   o!                  0    0    cliente_c_cliente_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.cliente_c_cliente_seq', 3, true);
            public       postgres    false    196                       0    0    compra_c_orden_compra_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.compra_c_orden_compra_seq', 2, true);
            public       postgres    false    200                       0    0    producto_c_producto_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.producto_c_producto_seq', 5, true);
            public       postgres    false    198            ~
           2606    25107    cliente cliente_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (c_cliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public         postgres    false    197            �
           2606    25141    compra compra_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.compra
    ADD CONSTRAINT compra_pkey PRIMARY KEY (c_orden_compra);
 <   ALTER TABLE ONLY public.compra DROP CONSTRAINT compra_pkey;
       public         postgres    false    201            �
           2606    25115    producto producto_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (c_producto);
 @   ALTER TABLE ONLY public.producto DROP CONSTRAINT producto_pkey;
       public         postgres    false    199            �
           2606    25147    compra compra_c_cliente_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.compra
    ADD CONSTRAINT compra_c_cliente_fkey FOREIGN KEY (c_cliente) REFERENCES public.cliente(c_cliente);
 F   ALTER TABLE ONLY public.compra DROP CONSTRAINT compra_c_cliente_fkey;
       public       postgres    false    2686    201    197            �
           2606    25142    compra compra_c_producto_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.compra
    ADD CONSTRAINT compra_c_producto_fkey FOREIGN KEY (c_producto) REFERENCES public.producto(c_producto);
 G   ALTER TABLE ONLY public.compra DROP CONSTRAINT compra_c_producto_fkey;
       public       postgres    false    201    199    2688            �
   9   x�3��(M����+��,�2���/N�H-J�r�9s3s��8}R��1z\\\ ���         '   x�3�4BN#CK]s]CN=.#\1z\\\ �sv         �   x�uN�
�0<�~E~@I�U{,z���mW)��d��7��(�>���q��`Hie�F�>�LD	*���+�ˀΣ�#ŉ�y�"��M��}7p��g-�PL�4�d�P�����,n��ʹ��.$y���ҽ�Z���i�>&ү����xY#��G�     