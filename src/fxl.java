import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fxl implements fxg, fxh {
   private static final all a = all.b("spectator/teleport_to_team");
   private static final xl b = xl.c("spectatorMenu.team_teleport");
   private static final xl c = xl.c("spectatorMenu.team_teleport.prompt");
   private final List<fxh> d;

   public fxl() {
      fjx $$0 = fjx.Q();
      this.d = a($$0, $$0.s.O());
   }

   private static List<fxh> a(fjx $$0, faw $$1) {
      return $$1.g().stream().flatMap($$1x -> fxl.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fxh> a() {
      return this.d;
   }

   @Override
   public xl b() {
      return c;
   }

   @Override
   public void a(fxf $$0) {
      $$0.a(this);
   }

   @Override
   public xl aT_() {
      return b;
   }

   @Override
   public void a(flj $$0, float $$1, float $$2) {
      $$0.a(gjh::B, a, 0, 0, 16, 16, axy.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.d.isEmpty();
   }

   static class a implements fxh {
      private final far a;
      private final Supplier<gzu> b;
      private final List<gdj> c;

      private a(far $$0, List<gdj> $$1, Supplier<gzu> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fxh> a(fjx $$0, far $$1) {
         List<gdj> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gdj $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dfc.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azv.a().a($$2.size())).a();
            Supplier<gzu> $$6 = $$0.an().a($$5);
            return Optional.of(new fxl.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fxf $$0) {
         $$0.a(new fxk(this.c));
      }

      @Override
      public xl aT_() {
         return this.a.c();
      }

      @Override
      public void a(flj $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axy.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fmv.a($$0, this.b.get(), 2, 2, 12, axy.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aU_() {
         return true;
      }
   }
}
