import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gqz extends gqe {
   private static final float a = 0.6666667F;
   private static final fcu b = new fcu(0.0, 0.33333334F, 0.046666667F);
   private final Map<eaa, gqz.a> c;

   public gqz(gql.a $$0) {
      super($$0);
      this.c = eaa.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gqz.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gew a(dym $$0, eaa $$1) {
      gqz.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dsv ? $$2.a() : $$2.b();
   }

   @Override
   protected hiz a(eaa $$0) {
      return got.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fho $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fho $$0, float $$1, dym $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dsv)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fcu c() {
      return b;
   }

   public static void a(fho $$0, gny $$1, int $$2, int $$3, gew $$4, hiz $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      fhs $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gew a(ggz $$0, eaa $$1, boolean $$2) {
      ghb $$3 = $$2 ? ghc.a($$1) : ghc.b($$1);
      return new gew.a($$0.a($$3), goi::g);
   }

   public static ghj a(boolean $$0) {
      ghl $$1 = new ghl();
      ghn $$2 = $$1.a();
      $$2.a("sign", ghi.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), ghf.a);
      if ($$0) {
         $$2.a("stick", ghi.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), ghf.a);
      }

      return ghj.a($$1, 64, 32);
   }

   static record a(gew a, gew b) {
   }
}
