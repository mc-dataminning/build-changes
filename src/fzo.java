import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fzo implements fzj, fzk {
   private static final alp a = alp.b("spectator/teleport_to_team");
   private static final xk b = xk.c("spectatorMenu.team_teleport");
   private static final xk c = xk.c("spectatorMenu.team_teleport.prompt");
   private final List<fzk> d;

   public fzo() {
      flz $$0 = flz.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<fzk> a(flz $$0, fcw $$1) {
      return $$1.g().stream().flatMap($$1x -> fzo.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fzk> a() {
      return this.d;
   }

   @Override
   public xk b() {
      return c;
   }

   @Override
   public void a(fzi $$0) {
      $$0.a(this);
   }

   @Override
   public xk aU_() {
      return b;
   }

   @Override
   public void a(fnl $$0, float $$1, float $$2) {
      $$0.a(glq::H, a, 0, 0, 16, 16, ayf.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aV_() {
      return !this.d.isEmpty();
   }

   static class a implements fzk {
      private final fcr a;
      private final Supplier<hch> b;
      private final List<gfr> c;

      private a(fcr $$0, List<gfr> $$1, Supplier<hch> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fzk> a(flz $$0, fcr $$1) {
         List<gfr> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gfr $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dgw.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(bac.a().a($$2.size())).a();
            Supplier<hch> $$6 = $$0.an().a($$5);
            return Optional.of(new fzo.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fzi $$0) {
         $$0.a(new fzn(this.c));
      }

      @Override
      public xk aU_() {
         return this.a.c();
      }

      @Override
      public void a(fnl $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, ayf.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         foy.a($$0, this.b.get(), 2, 2, 12, ayf.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aV_() {
         return true;
      }
   }
}
