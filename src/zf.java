public class zf {
   public static final yr<yw> a = a("custom_payload");
   public static final yr<yx> b = a("disconnect");
   public static final yr<yy> c = a("keep_alive");
   public static final yr<yz> d = a("ping");
   public static final yr<za> e = a("resource_pack_pop");
   public static final yr<zb> f = a("resource_pack_push");
   public static final yr<zc> g = a("store_cookie");
   public static final yr<zd> h = a("transfer");
   public static final yr<ze> i = a("update_tags");
   public static final yr<zh> j = b("client_information");
   public static final yr<zi> k = b("custom_payload");
   public static final yr<zj> l = b("keep_alive");
   public static final yr<zk> m = b("pong");
   public static final yr<zl> n = b("resource_pack");

   private static <T extends yp<yv>> yr<T> a(String $$0) {
      return new yr<>(yq.b, new ajv($$0));
   }

   private static <T extends yp<zg>> yr<T> b(String $$0) {
      return new yr<>(yq.a, new ajv($$0));
   }
}
