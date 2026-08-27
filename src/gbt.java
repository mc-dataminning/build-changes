public class gbt {
   public static final wx a = wx.c("quickplay.error.title");
   private static final wx b = wx.c("quickplay.error.invalid_identifier");
   private static final wx c = wx.c("quickplay.error.realm_connect");
   private static final wx d = wx.c("quickplay.error.realm_permission");
   private static final wx e = wx.c("gui.toTitle");
   private static final wx f = wx.c("gui.toWorld");
   private static final wx g = wx.c("gui.toRealms");

   public static void a(fdz $$0, frm.c $$1, ezi $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ayy.h($$3)) {
         a($$0, $$3);
      } else if (!ayy.h($$4)) {
         b($$0, $$4);
      } else if (!ayy.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fdz $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fly $$2 = new fqu(new fmd());
         $$0.a(new fkz($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fmd()));
      }
   }

   private static void b(fdz $$0, String $$1) {
      fxg $$2 = new fxg($$0);
      $$2.a();
      fxf $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fxf(gpb.a("selectServer.defaultName"), $$1, fxf.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      fyi $$4 = fyi.a($$1);
      fkr.a(new fow(new fmd()), $$0, $$4, $$3, true, null);
   }

   private static void a(fdz $$0, ezi $$1, String $$2) {
      long $$3;
      fab $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fly $$6 = new ezd(new fmd());
         $$0.a(new fkz($$6, a, b, g));
         return;
      } catch (fav var10) {
         fly $$8 = new fmd();
         $$0.a(new fkz($$8, a, c, e));
         return;
      }

      ezz $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fly $$12 = new ezd(new fmd());
         $$0.a(new fkz($$12, a, d, g));
      } else {
         fmd $$13 = new fmd();
         fcy $$14 = new fcy($$13, $$11);
         $$0.a(new fbp($$13, $$14));
      }
   }
}
