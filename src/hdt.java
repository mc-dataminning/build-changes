import com.mojang.serialization.MapCodec;

public class hdt implements hdm {
   private final gee a;

   public hdt(gee $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      ffw $$6 = gsz.a($$2, this.a.a(gee.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdq.a {
      public static final MapCodec<hdt.a> a = MapCodec.unit(new hdt.a());

      @Override
      public MapCodec<hdt.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         return new hdt(new gee($$0.a(gez.dl)));
      }
   }
}
