public class zp {
   public static final zb<zg> a = a("custom_payload");
   public static final zb<zh> b = a("disconnect");
   public static final zb<zi> c = a("keep_alive");
   public static final zb<zj> d = a("ping");
   public static final zb<zk> e = a("resource_pack_pop");
   public static final zb<zl> f = a("resource_pack_push");
   public static final zb<zm> g = a("store_cookie");
   public static final zb<zn> h = a("transfer");
   public static final zb<zo> i = a("update_tags");
   public static final zb<zr> j = b("client_information");
   public static final zb<zs> k = b("custom_payload");
   public static final zb<zt> l = b("keep_alive");
   public static final zb<zu> m = b("pong");
   public static final zb<zv> n = b("resource_pack");

   private static <T extends yz<zf>> zb<T> a(String $$0) {
      return new zb<>(za.b, new akf($$0));
   }

   private static <T extends yz<zq>> zb<T> b(String $$0) {
      return new zb<>(za.a, new akf($$0));
   }
}
