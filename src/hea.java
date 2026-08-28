import com.mojang.serialization.MapCodec;

public class hea implements hdt {
   private final gei a;

   public hea(gei $$0) {
      this.a = $$0;
   }

   @Override
   public void a(cwo $$0, ffv $$1, glz $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      ffz $$6 = gtd.a($$2, this.a.a(gei.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   public static record a() implements hdx.a {
      public static final MapCodec<hea.a> a = MapCodec.unit(new hea.a());

      @Override
      public MapCodec<hea.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         return new hea(new gei($$0.a(gfd.dl)));
      }
   }
}
