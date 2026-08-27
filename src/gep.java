public class gep {
   public static final xe a = xe.c("quickplay.error.title");
   private static final xe b = xe.c("quickplay.error.invalid_identifier");
   private static final xe c = xe.c("quickplay.error.realm_connect");
   private static final xe d = xe.c("quickplay.error.realm_permission");
   private static final xe e = xe.c("gui.toTitle");
   private static final xe f = xe.c("gui.toWorld");
   private static final xe g = xe.c("gui.toRealms");

   public static void a(fgj $$0, fuf.c $$1, fbs $$2) {
      String $$3 = $$1.c();
      String $$4 = $$1.d();
      String $$5 = $$1.e();
      if (!azh.h($$3)) {
         a($$0, $$3);
      } else if (!azh.h($$4)) {
         b($$0, $$4);
      } else if (!azh.h($$5)) {
         a($$0, $$2, $$5);
      }
   }

   private static void a(fgj $$0, String $$1) {
      if (!$$0.m().b($$1)) {
         fon $$2 = new ftn(new fou());
         $$0.a(new fnn($$2, a, b, f));
      } else {
         $$0.x().a($$1, () -> $$0.a(new fou()));
      }
   }

   private static void b(fgj $$0, String $$1) {
      gac $$2 = new gac($$0);
      $$2.a();
      gab $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new gab(gse.a("selectServer.defaultName"), $$1, gab.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gbe $$4 = gbe.a($$1);
      fnf.a(new frp(new fou()), $$0, $$4, $$3, true, null);
   }

   private static void a(fgj $$0, fbs $$1, String $$2) {
      long $$3;
      fcl $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.b();
      } catch (NumberFormatException var9) {
         fon $$6 = new fbn(new fou());
         $$0.a(new fnn($$6, a, b, g));
         return;
      } catch (fdf var10) {
         fon $$8 = new fou();
         $$0.a(new fnn($$8, a, c, e));
         return;
      }

      fcj $$11 = $$4.a.stream().filter($$1x -> $$1x.a == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         fon $$12 = new fbn(new fou());
         $$0.a(new fnn($$12, a, d, g));
      } else {
         fou $$13 = new fou();
         ffi $$14 = new ffi($$13, $$11);
         $$0.a(new fdz($$13, $$14));
      }
   }
}
