import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fvv implements fvq, fvr {
   private static final alc a = alc.b("spectator/teleport_to_team");
   private static final xd b = xd.c("spectatorMenu.team_teleport");
   private static final xd c = xd.c("spectatorMenu.team_teleport.prompt");
   private final List<fvr> d;

   public fvv() {
      fil $$0 = fil.Q();
      this.d = a($$0, $$0.s.O());
   }

   private static List<fvr> a(fil $$0, ezx $$1) {
      return $$1.g().stream().flatMap($$1x -> fvv.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fvr> a() {
      return this.d;
   }

   @Override
   public xd b() {
      return c;
   }

   @Override
   public void a(fvp $$0) {
      $$0.a(this);
   }

   @Override
   public xd aS_() {
      return b;
   }

   @Override
   public void a(fjx $$0, float $$1, float $$2) {
      $$0.a(ghq::B, a, 0, 0, 16, 16, axo.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements fvr {
      private final ezs a;
      private final Supplier<gyc> b;
      private final List<gbs> c;

      private a(ezs $$0, List<gbs> $$1, Supplier<gyc> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fvr> a(fil $$0, ezs $$1) {
         List<gbs> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gbs $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != ded.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azl.a().a($$2.size())).a();
            Supplier<gyc> $$6 = $$0.an().a($$5);
            return Optional.of(new fvv.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fvp $$0) {
         $$0.a(new fvu(this.c));
      }

      @Override
      public xd aS_() {
         return this.a.c();
      }

      @Override
      public void a(fjx $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axo.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         flj.a($$0, this.b.get(), 2, 2, 12, axo.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
