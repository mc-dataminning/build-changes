import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class le extends la<le> implements kz {
   private static final kz.a<le> a = new kz.a<le>() {
      public le a(la<le> $$0, StringReader $$1, jc.a $$2) {
         return (le)$$0;
      }
   };
   private final Codec<le> b = Codec.unit(this::f);
   private final zc<wp, le> c = zc.a(this);

   protected le(boolean $$0) {
      super($$0, a);
   }

   public le f() {
      return this;
   }

   @Override
   public Codec<le> d() {
      return this.b;
   }

   @Override
   public zc<wp, le> e() {
      return this.c;
   }

   @Override
   public String a(jc.a $$0) {
      return lh.j.b(this).toString();
   }
}
