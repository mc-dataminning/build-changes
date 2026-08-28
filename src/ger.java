import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class ger implements gem, gen {
   private static final alg a = alg.b("spectator/teleport_to_team");
   private static final wy b = wy.c("spectatorMenu.team_teleport");
   private static final wy c = wy.c("spectatorMenu.team_teleport.prompt");
   private final List<gen> d;

   public ger() {
      fpt $$0 = fpt.Q();
      this.d = a($$0, $$0.s.R());
   }

   private static List<gen> a(fpt $$0, fgh $$1) {
      return $$1.f().stream().flatMap($$1x -> ger.a.a($$0, $$1x).stream()).toList();
   }

   @Override
   public List<gen> a() {
      return this.d;
   }

   @Override
   public wy b() {
      return c;
   }

   @Override
   public void a(gel $$0) {
      $$0.a(this);
   }

   @Override
   public wy aP_() {
      return b;
   }

   @Override
   public void a(fsm $$0, float $$1, float $$2) {
      $$0.a(grc::H, a, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aQ_() {
      return !this.d.isEmpty();
   }

   static class a implements gen {
      private final fgc a;
      private final Supplier<hks> b;
      private final List<glc> c;

      private a(fgc $$0, List<glc> $$1, Supplier<hks> $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public static Optional<gen> a(fpt $$0, fgc $$1) {
         List<glc> $$2 = new ArrayList<>();

         for (String $$3 : $$1.h()) {
            glc $$4 = $$0.L().a($$3);
            if ($$4 != null && $$4.e() != djj.d) {
               $$2.add($$4);
            }
         }

         if ($$2.isEmpty()) {
            return Optional.empty();
         } else {
            GameProfile $$5 = $$2.get(azv.a().a($$2.size())).a();
            Supplier<hks> $$6 = $$0.an().a($$5);
            return Optional.of(new ger.a($$1, $$2, $$6));
         }
      }

      @Override
      public void a(gel $$0) {
         $$0.a(new geq(this.c));
      }

      @Override
      public wy aP_() {
         return this.a.d();
      }

      @Override
      public void a(fsm $$0, float $$1, float $$2) {
         Integer $$3 = this.a.o().f();
         if ($$3 != null) {
            float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
            float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
            float $$6 = (float)($$3 & 0xFF) / 255.0F;
            $$0.a(1, 1, 15, 15, axw.a($$2, $$4 * $$1, $$5 * $$1, $$6 * $$1));
         }

         ftz.a($$0, this.b.get(), 2, 2, 12, axw.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aQ_() {
         return true;
      }
   }
}
