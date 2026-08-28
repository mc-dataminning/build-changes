import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gvc extends guh {
   private static final float a = 0.6666667F;
   private static final ffq b = new ffq(0.0, 0.33333334F, 0.046666667F);
   private final Map<ecs, gvc.a> c;

   public gvc(guo.a $$0) {
      super($$0);
      this.c = ecs.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gvc.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected giw a(ebe $$0, ecs $$1) {
      gvc.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dvh ? $$2.a() : $$2.b();
   }

   @Override
   protected hnh a(ecs $$0) {
      return gsu.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(flo $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(flo $$0, float $$1, ebe $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dvh)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected ffq c() {
      return b;
   }

   public static void a(flo $$0, gsa $$1, int $$2, int $$3, giw $$4, hnh $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      flr $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static giw a(gla $$0, ecs $$1, boolean $$2) {
      glc $$3 = $$2 ? gld.a($$1) : gld.b($$1);
      return new giw.a($$0.a($$3), gsl::g);
   }

   public static glk a(boolean $$0) {
      glm $$1 = new glm();
      glo $$2 = $$1.a();
      $$2.a("sign", glj.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), glg.a);
      if ($$0) {
         $$2.a("stick", glj.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), glg.a);
      }

      return glk.a($$1, 64, 32);
   }

   static record a(giw a, giw b) {
   }
}
