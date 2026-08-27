public class yr {
   public static final yd<yi> a = a("custom_payload");
   public static final yd<yj> b = a("disconnect");
   public static final yd<yk> c = a("keep_alive");
   public static final yd<yl> d = a("ping");
   public static final yd<ym> e = a("resource_pack_pop");
   public static final yd<yn> f = a("resource_pack_push");
   public static final yd<yo> g = a("store_cookie");
   public static final yd<yp> h = a("transfer");
   public static final yd<yq> i = a("update_tags");
   public static final yd<yt> j = b("client_information");
   public static final yd<yu> k = b("custom_payload");
   public static final yd<yv> l = b("keep_alive");
   public static final yd<yw> m = b("pong");
   public static final yd<yx> n = b("resource_pack");

   private static <T extends yb<yh>> yd<T> a(String $$0) {
      return new yd<>(yc.b, new ajh($$0));
   }

   private static <T extends yb<ys>> yd<T> b(String $$0) {
      return new yd<>(yc.a, new ajh($$0));
   }
}
