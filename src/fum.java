import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fum {
   private static final int a = 182;
   private static final int b = 5;
   private static final alk[] c = new alk[]{
      alk.b("boss_bar/pink_background"),
      alk.b("boss_bar/blue_background"),
      alk.b("boss_bar/red_background"),
      alk.b("boss_bar/green_background"),
      alk.b("boss_bar/yellow_background"),
      alk.b("boss_bar/purple_background"),
      alk.b("boss_bar/white_background")
   };
   private static final alk[] d = new alk[]{
      alk.b("boss_bar/pink_progress"),
      alk.b("boss_bar/blue_progress"),
      alk.b("boss_bar/red_progress"),
      alk.b("boss_bar/green_progress"),
      alk.b("boss_bar/yellow_progress"),
      alk.b("boss_bar/purple_progress"),
      alk.b("boss_bar/white_progress")
   };
   private static final alk[] e = new alk[]{
      alk.b("boss_bar/notched_6_background"),
      alk.b("boss_bar/notched_10_background"),
      alk.b("boss_bar/notched_12_background"),
      alk.b("boss_bar/notched_20_background")
   };
   private static final alk[] f = new alk[]{
      alk.b("boss_bar/notched_6_progress"), alk.b("boss_bar/notched_10_progress"), alk.b("boss_bar/notched_12_progress"), alk.b("boss_bar/notched_20_progress")
   };
   private final frf g;
   final Map<UUID, fvb> h = Maps.newLinkedHashMap();

   public fum(frf $$0) {
      this.g = $$0;
   }

   public void a(ftz $$0) {
      if (!this.h.isEmpty()) {
         brd $$1 = brc.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fvb $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            xc $$7 = $$4.j();
            int $$8 = this.g.h.a($$7);
            int $$9 = $$2 / 2 - $$8 / 2;
            int $$10 = $$3 - 9;
            $$0.b(this.g.h, $$7, $$9, $$10, 16777215);
            $$3 += 10 + 9;
            if ($$3 >= $$0.b() / 3) {
               break;
            }
         }

         $$1.c();
      }
   }

   private void a(ftz $$0, int $$1, int $$2, buj $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azq.b($$3.k(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(ftz $$0, int $$1, int $$2, buj $$3, int $$4, alk[] $$5, alk[] $$6) {
      $$0.a(gsn::H, $$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.m() != buj.b.a) {
         $$0.a(gsn::H, $$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(ach $$0) {
      $$0.a(new ach.b() {
         @Override
         public void a(UUID $$0, xc $$1, float $$2, buj.a $$3, buj.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fum.this.h.put($$0, new fvb($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fum.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fum.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xc $$1) {
            fum.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, buj.a $$1, buj.b $$2) {
            fvb $$3 = fum.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fvb $$4 = fum.this.h.get($$0);
            $$4.a($$1);
            $$4.b($$2);
            $$4.c($$3);
         }
      });
   }

   public void a() {
      this.h.clear();
   }

   public boolean b() {
      if (!this.h.isEmpty()) {
         for (buj $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (buj $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (buj $$0 : this.h.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
