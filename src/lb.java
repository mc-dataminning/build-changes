import com.mojang.brigadier.StringReader;
import com.mojang.serialization.MapCodec;

public class lb extends kx<lb> implements kw {
   private static final kw.a<lb> a = new kw.a<lb>() {
      public lb a(kx<lb> $$0, StringReader $$1, iz.a $$2) {
         return (lb)$$0;
      }
   };
   private final MapCodec<lb> b = MapCodec.unit(this::f);
   private final yv<wi, lb> c = yv.a(this);

   protected lb(boolean $$0) {
      super($$0, a);
   }

   public lb f() {
      return this;
   }

   @Override
   public MapCodec<lb> d() {
      return this.b;
   }

   @Override
   public yv<wi, lb> e() {
      return this.c;
   }

   @Override
   public String a(iz.a $$0) {
      return le.j.b(this).toString();
   }
}
