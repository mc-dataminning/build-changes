import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class ko extends kk<ko> implements kj {
   private static final kj.a<ko> a = new kj.a<ko>() {
      public ko a(kk<ko> $$0, StringReader $$1, in.a $$2) {
         return (ko)$$0;
      }
   };
   private final Codec<ko> b = Codec.unit(this::f);
   private final ye<vr, ko> c = ye.a(this);

   protected ko(boolean $$0) {
      super($$0, a);
   }

   public ko f() {
      return this;
   }

   @Override
   public Codec<ko> d() {
      return this.b;
   }

   @Override
   public ye<vr, ko> e() {
      return this.c;
   }

   @Override
   public String a(in.a $$0) {
      return kr.j.b(this).toString();
   }
}
