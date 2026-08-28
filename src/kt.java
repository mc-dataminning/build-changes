import com.mojang.serialization.Codec;

public class kt {
   public static final ks.b<kr> a = a("damage", kr.a);
   public static final ks.b<ku.a> b = a("enchantments", ku.a.a);
   public static final ks.b<ku.b> c = a("stored_enchantments", ku.b.a);
   public static final ks.b<ky> d = a("potion_contents", ky.a);
   public static final ks.b<kq> e = a("custom_data", kq.a);
   public static final ks.b<kp> f = a("container", kp.a);
   public static final ks.b<ko> g = a("bundle_contents", ko.a);
   public static final ks.b<kv> h = a("firework_explosion", kv.a);
   public static final ks.b<kw> i = a("fireworks", kw.a);
   public static final ks.b<la> j = a("writable_book_content", la.a);
   public static final ks.b<lb> k = a("written_book_content", lb.a);
   public static final ks.b<kn> l = a("attribute_modifiers", kn.a);
   public static final ks.b<kz> m = a("trim", kz.a);
   public static final ks.b<kx> n = a("jukebox_playable", kx.a);

   private static <T extends ks> ks.b<T> a(String $$0, Codec<T> $$1) {
      return jr.a(mf.ao, $$0, new ks.b<>($$1));
   }

   public static ks.b<?> a(jr<ks.b<?>> $$0) {
      return a;
   }
}
