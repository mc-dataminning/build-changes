import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class fxt implements fxo, fxp {
   private static final alj a = alj.b("spectator/teleport_to_team");
   private static final xj b = xj.c("spectatorMenu.team_teleport");
   private static final xj c = xj.c("spectatorMenu.team_teleport.prompt");
   private final List<fxp> d;

   public fxt() {
      fke $$0 = fke.Q();
      this.d = a($$0, $$0.s.P());
   }

   private static List<fxp> a(fke $$0, fbd $$1) {
      return $$1.g().stream().flatMap($$1x -> fxt.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<fxp> a() {
      return this.d;
   }

   @Override
   public xj b() {
      return c;
   }

   @Override
   public void a(fxn $$0) {
      $$0.a(this);
   }

   @Override
   public xj aS_() {
      return b;
   }

   @Override
   public void a(flq $$0, float $$1, float $$2) {
      $$0.a(gjq::B, a, 0, 0, 16, 16, axx.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.d.isEmpty();
   }

   static class a implements fxp {
      private final fay a;
      private final Supplier<haf> b;
      private final List<gds> c;

      private a(fay $$0, List<gds> $$1, Supplier<haf> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<fxp> a(fke $$0, fay $$1) {
         List<gds> $$2 = new ArrayList<>();

         for (String $$3 : $$1.g()) {
            gds $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != dfj.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azu.a().a($$2.size())).a();
            Supplier<haf> $$6 = $$0.an().a($$5);
            return Optional.of(new fxt.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(fxn $$0) {
         $$0.a(new fxs(this.c));
      }

      @Override
      public xj aS_() {
         return this.a.c();
      }

      @Override
      public void a(flq $$0, float $$1, float $$2) {
         Integer $$3 = this.a.n().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axx.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         fnc.a($$0, this.b.get(), 2, 2, 12, axx.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aT_() {
         return true;
      }
   }
}
