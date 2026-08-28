import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gdg implements gdc, gdd {
   private static final ale a = ale.b("spectator/teleport_to_player");
   private static final Comparator<gjp> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final ww c = ww.c("spectatorMenu.teleport");
   private static final ww d = ww.c("spectatorMenu.teleport.prompt");
   private final List<gdd> e;

   public gdg() {
      this(fof.Q().L().l());
   }

   public gdg(Collection<gjp> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dim.d).sorted(b).map($$0x -> new gcz($$0x.a())).toList();
   }

   @Override
   public List<gdd> a() {
      return this.e;
   }

   @Override
   public ww b() {
      return d;
   }

   @Override
   public void a(gdb $$0) {
      $$0.a(this);
   }

   @Override
   public ww aO_() {
      return c;
   }

   @Override
   public void a(frc $$0, float $$1, float $$2) {
      $$0.a(gpn::H, a, 0, 0, 16, 16, axu.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
