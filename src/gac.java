import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gac extends gag {
   private static final String a = "plank";
   private static final String b = "vChains";
   private static final String c = "normalChains";
   private static final String d = "chainL1";
   private static final String e = "chainL2";
   private static final String f = "chainR1";
   private static final String g = "chainR2";
   private static final String h = "board";
   private static final float i = 1.0F;
   private static final float j = 0.9F;
   private static final ept k = new ept(0.0, -0.32F, 0.073F);
   private final Map<doo, gac.a> l;

   public gac(fzt.a $$0) {
      super($$0);
      this.l = doo.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gac.a($$0.a(fre.b($$1)))));
   }

   @Override
   public float b() {
      return 1.0F;
   }

   @Override
   public float c() {
      return 0.9F;
   }

   @Override
   public void a(dlr $$0, float $$1, eub $$2, fxs $$3, int $$4, int $$5) {
      dnb $$6 = $$0.n();
      dhb $$7 = (dhb)$$6.b();
      doo $$8 = dhb.a($$7);
      gac.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(eub $$0, float $$1, dnb $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(eub $$0, int $$1, int $$2, fpb $$3, euf $$4) {
      gac.a $$5 = (gac.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   glf a(doo $$0) {
      return fyh.b($$0);
   }

   @Override
   ept d() {
      return k;
   }

   public static frl e() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("board", frk.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), frh.a);
      $$1.a("plank", frk.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), frh.a);
      fro $$2 = $$1.a("normalChains", frk.c(), frh.a);
      $$2.a("chainL1", frk.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), frh.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", frk.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), frh.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", frk.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), frh.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", frk.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), frh.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", frk.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), frh.a);
      return frl.a($$0, 64, 32);
   }

   public static final class a extends fpb {
      public final frf a;
      public final frf b;
      public final frf c;
      public final frf d;

      public a(frf $$0) {
         super(fya::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dnb $$0) {
         boolean $$1 = !($$0.b() instanceof dbb);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dnr.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(eub $$0, euf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
