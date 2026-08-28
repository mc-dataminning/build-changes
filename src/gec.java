public class gec {
   public static final wy a = wy.c("quickplay.error.title");
   private static final wy b = wy.c("quickplay.error.invalid_identifier");
   private static final wy c = wy.c("quickplay.error.realm_connect");
   private static final wy d = wy.c("quickplay.error.realm_permission");
   private static final wy e = wy.c("gui.toTitle");
   private static final wy f = wy.c("gui.toWorld");
   private static final wy g = wy.c("gui.toRealms");

   public static void a(fgi $$0, ftu.c $$1, fbs $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azk.h($$3)) {
         a($$0, $$3);
      } else if (!azk.h($$4)) {
         b($$0, $$4);
      } else if (!azk.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fgi $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fnx $$2 = new ftc(new fnz());
         $$0.a(new fne($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fnz()));
      }
   }

   private static void b(fgi $$0, String $$1) {
      fzo $$2 = new fzo($$0);
      $$2.a();
      fzn $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new fzn(grl.a("selectServer.defaultName"), $$1, fzn.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gar $$4 = gar.a($$1);
      fmw.a(new fqn(new fnz()), $$0, $$4, $$3, true, null);
   }

   private static void a(fgi $$0, fbs $$1, String $$2) {
      long $$3;
      fcl $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fnx $$6 = new fbn(new fnz());
         $$0.a(new fne($$6, a, b, g));
         return;
      } catch (fdd var10) {
         fnx $$8 = new fnz();
         $$0.a(new fne($$8, a, c, e));
         return;
      }

      fcj $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fnx $$12 = new fbn(new fnz());
         $$0.a(new fne($$12, a, d, g));
      } else {
         fnz $$13 = new fnz();
         ffg $$14 = new ffg($$13, $$11);
         $$0.a(new fdx($$13, $$14));
      }
   }
}
