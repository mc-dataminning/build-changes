import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gse extends grj {
   private static final float a = 0.6666667F;
   private static final fdw b = new fdw(0.0, 0.33333334F, 0.046666667F);
   private final Map<ebc, gse.a> c;

   public gse(grq.a $$0) {
      super($$0);
      this.c = ebc.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gse.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gfz a(dzo $$0, ebc $$1) {
      gse.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dtv ? $$2.a() : $$2.b();
   }

   @Override
   protected hkg a(ebc $$0) {
      return gpy.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fiq $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fiq $$0, float $$1, dzo $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dtv)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fdw c() {
      return b;
   }

   public static void a(fiq $$0, gpd $$1, int $$2, int $$3, gfz $$4, hkg $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      fiu $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gfz a(gic $$0, ebc $$1, boolean $$2) {
      gie $$3 = $$2 ? gif.a($$1) : gif.b($$1);
      return new gfz.a($$0.a($$3), gpn::g);
   }

   public static gim a(boolean $$0) {
      gio $$1 = new gio();
      giq $$2 = $$1.a();
      $$2.a("sign", gil.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gii.a);
      if ($$0) {
         $$2.a("stick", gil.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gii.a);
      }

      return gim.a($$1, 64, 32);
   }

   static record a(gfz a, gfz b) {
   }
}
