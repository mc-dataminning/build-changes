public class grg {
   public static final xa a = xa.c("quickplay.error.title");
   private static final xa b = xa.c("quickplay.error.invalid_identifier");
   private static final xa c = xa.c("quickplay.error.realm_connect");
   private static final xa d = xa.c("quickplay.error.realm_permission");
   private static final xa e = xa.c("gui.toTitle");
   private static final xa f = xa.c("gui.toWorld");
   private static final xa g = xa.c("gui.toRealms");

   public static void a(frd $$0, ggf.c $$1, fmd $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!ban.h($$3)) {
         a($$0, $$3);
      } else if (!ban.h($$4)) {
         b($$0, $$4);
      } else if (!ban.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(frd $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         gad $$2 = new gfm(new gaf());
         $$0.a(new fzk($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new gaf()));
      }
   }

   private static void b(frd $$0, String $$1) {
      gmr $$2 = new gmr($$0);
      $$2.a();
      gmq $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gmq(hmi.a("selectServer.defaultName"), $$1, gmq.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gnt $$4 = gnt.a($$1);
      fzc.a(new gcv(new gaf()), $$0, $$4, $$3, true, null);
   }

   private static void a(frd $$0, fmd $$1, String $$2) {
      long $$3;
      fng $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.c();
      } catch (NumberFormatException var9) {
         gad $$6 = new fly(new gaf());
         $$0.a(new fzk($$6, a, b, g));
         return;
      } catch (fnz var10) {
         gad $$8 = new gaf();
         $$0.a(new fzk($$8, a, c, e));
         return;
      }

      fne $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         gad $$12 = new fly(new gaf());
         $$0.a(new fzk($$12, a, d, g));
      } else {
         gaf $$13 = new gaf();
         fqa $$14 = new fqa($$13, $$11);
         $$0.a(new fou($$13, $$14));
      }
   }
}
