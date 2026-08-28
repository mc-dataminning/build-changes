public class gri {
   public static final xc a = xc.c("quickplay.error.title");
   private static final xc b = xc.c("quickplay.error.invalid_identifier");
   private static final xc c = xc.c("quickplay.error.realm_connect");
   private static final xc d = xc.c("quickplay.error.realm_permission");
   private static final xc e = xc.c("gui.toTitle");
   private static final xc f = xc.c("gui.toWorld");
   private static final xc g = xc.c("gui.toRealms");

   public static void a(frf $$0, ggh.c $$1, fmf $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!bap.h($$3)) {
         a($$0, $$3);
      } else if (!bap.h($$4)) {
         b($$0, $$4);
      } else if (!bap.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(frf $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         gaf $$2 = new gfo(new gah());
         $$0.a(new fzm($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new gah()));
      }
   }

   private static void b(frf $$0, String $$1) {
      gmt $$2 = new gmt($$0);
      $$2.a();
      gms $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gms(hmk.a("selectServer.defaultName"), $$1, gms.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gnv $$4 = gnv.a($$1);
      fze.a(new gcx(new gah()), $$0, $$4, $$3, true, null);
   }

   private static void a(frf $$0, fmf $$1, String $$2) {
      long $$3;
      fni $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.c();
      } catch (NumberFormatException var9) {
         gaf $$6 = new fma(new gah());
         $$0.a(new fzm($$6, a, b, g));
         return;
      } catch (fob var10) {
         gaf $$8 = new gah();
         $$0.a(new fzm($$8, a, c, e));
         return;
      }

      fng $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         gaf $$12 = new fma(new gah());
         $$0.a(new fzm($$12, a, d, g));
      } else {
         gah $$13 = new gah();
         fqc $$14 = new fqc($$13, $$11);
         $$0.a(new fow($$13, $$14));
      }
   }
}
