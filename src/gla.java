public class gla {
   public static final wo a = wo.c("quickplay.error.title");
   private static final wo b = wo.c("quickplay.error.invalid_identifier");
   private static final wo c = wo.c("quickplay.error.realm_connect");
   private static final wo d = wo.c("quickplay.error.realm_permission");
   private static final wo e = wo.c("gui.toTitle");
   private static final wo f = wo.c("gui.toWorld");
   private static final wo g = wo.c("gui.toRealms");

   public static void a(flh $$0, gai.c $$1, fgi $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azv.h($$3)) {
         a($$0, $$3);
      } else if (!azv.h($$4)) {
         b($$0, $$4);
      } else if (!azv.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(flh $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fui $$2 = new fzp(new fuk());
         $$0.a(new ftp($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fuk()));
      }
   }

   private static void b(flh $$0, String $$1) {
      ggm $$2 = new ggm($$0);
      $$2.a();
      ggl $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new ggl(hfu.a("selectServer.defaultName"), $$1, ggl.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gho $$4 = gho.a($$1);
      fth.a(new fwy(new fuk()), $$0, $$4, $$3, true, null);
   }

   private static void a(flh $$0, fgi $$1, String $$2) {
      long $$3;
      fhl $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fui $$6 = new fgd(new fuk());
         $$0.a(new ftp($$6, a, b, g));
         return;
      } catch (fie var10) {
         fui $$8 = new fuk();
         $$0.a(new ftp($$8, a, c, e));
         return;
      }

      fhj $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fui $$12 = new fgd(new fuk());
         $$0.a(new ftp($$12, a, d, g));
      } else {
         fuk $$13 = new fuk();
         fke $$14 = new fke($$13, $$11);
         $$0.a(new fiy($$13, $$14));
      }
   }
}
