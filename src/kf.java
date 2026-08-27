import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class kf extends kb<kf> implements ka {
   private static final ka.a<kf> a = new ka.a<kf>() {
      public kf a(kb<kf> $$0, StringReader $$1, in.a $$2) {
         return (kf)$$0;
      }
   };
   private final Codec<kf> b = Codec.unit(this::f);
   private final xs<vf, kf> c = xs.a(this);

   protected kf(boolean $$0) {
      super($$0, a);
   }

   public kf f() {
      return this;
   }

   @Override
   public Codec<kf> d() {
      return this.b;
   }

   @Override
   public xs<vf, kf> e() {
      return this.c;
   }

   @Override
   public String a(in.a $$0) {
      return ki.j.b(this).toString();
   }
}
