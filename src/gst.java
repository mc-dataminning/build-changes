import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gst extends gry {
   private static final float a = 0.6666667F;
   private static final fei b = new fei(0.0, 0.33333334F, 0.046666667F);
   private final Map<ebn, gst.a> c;

   public gst(gsf.a $$0) {
      super($$0);
      this.c = ebn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gst.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected ggm a(dzz $$0, ebn $$1) {
      gst.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dud ? $$2.a() : $$2.b();
   }

   @Override
   protected hkw a(ebn $$0) {
      return gqn.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fjc $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fjc $$0, float $$1, dzz $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dud)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fei c() {
      return b;
   }

   public static void a(fjc $$0, gps $$1, int $$2, int $$3, ggm $$4, hkw $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      fjg $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static ggm a(giq $$0, ebn $$1, boolean $$2) {
      gis $$3 = $$2 ? git.a($$1) : git.b($$1);
      return new ggm.a($$0.a($$3), gqc::g);
   }

   public static gja a(boolean $$0) {
      gjc $$1 = new gjc();
      gje $$2 = $$1.a();
      $$2.a("sign", giz.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), giw.a);
      if ($$0) {
         $$2.a("stick", giz.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), giw.a);
      }

      return gja.a($$1, 64, 32);
   }

   static record a(ggm a, ggm b) {
   }
}
