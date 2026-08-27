public class zr {
   public static final zd<zi> a = a("custom_payload");
   public static final zd<zj> b = a("disconnect");
   public static final zd<zk> c = a("keep_alive");
   public static final zd<zl> d = a("ping");
   public static final zd<zm> e = a("resource_pack_pop");
   public static final zd<zn> f = a("resource_pack_push");
   public static final zd<zo> g = a("store_cookie");
   public static final zd<zp> h = a("transfer");
   public static final zd<zq> i = a("update_tags");
   public static final zd<zt> j = b("client_information");
   public static final zd<zu> k = b("custom_payload");
   public static final zd<zv> l = b("keep_alive");
   public static final zd<zw> m = b("pong");
   public static final zd<zx> n = b("resource_pack");

   private static <T extends zb<zh>> zd<T> a(String $$0) {
      return new zd<>(zc.b, new akh($$0));
   }

   private static <T extends zb<zs>> zd<T> b(String $$0) {
      return new zd<>(zc.a, new akh($$0));
   }
}
