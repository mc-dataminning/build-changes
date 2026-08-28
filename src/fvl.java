import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fvl implements fvg, fvh {
   private static final alb a = alb.b("spectator/teleport_to_team");
   private static final xd b = xd.c("spectatorMenu.team_teleport");
   private static final xd c = xd.c("spectatorMenu.team_teleport.prompt");
   private final List<fvh> d;

   public fvl() {
      fib $$0 = fib.Q();
      this.d = a($$0, $$0.s.O());
   }

   private static List<fvh> a(fib $$0, ezi $$1) {
      return $$1.g().stream().flatMap($$1x -> fvl.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fvh> a() {
      return this.d;
   }

   @Override
   public xd b() {
      return c;
   }

   @Override
   public void a(fvf $$0) {
      $$0.a(this);
   }

   @Override
   public xd aU_() {
      return b;
   }

   @Override
   public void a(fjn $$0, float $$1, float $$2) {
      $$0.a(ghe::C, a, 0, 0, 16, 16, axn.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aV_() {
      return !this.d.isEmpty();
   }

   static class a implements fvh {
      private final ezd a;
      private final Supplier<gxl> b;
      private final List<gbi> c;

      private a(ezd $$0, List<gbi> $$1, Supplier<gxl> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fvh> a(fib $$0, ezd $$1) {
         List<gbi> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gbi $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != ddp.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azk.a().a($$2.size())).a();
            Supplier<gxl> $$6 = $$0.am().a($$5);
            return Optional.of(new fvl.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fvf $$0) {
         $$0.a(new fvk(this.c));
      }

      @Override
      public xd aU_() {
         return this.a.c();
      }

      @Override
      public void a(fjn $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axn.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fkz.a($$0, this.b.get(), 2, 2, 12, axn.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }
}
