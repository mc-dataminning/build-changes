import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fvy implements fvu, fvv {
   private static final ale a = ale.b("spectator/teleport_to_player");
   private static final Comparator<gbx> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xe c = xe.c("spectatorMenu.teleport");
   private static final xe d = xe.c("spectatorMenu.teleport.prompt");
   private final List<fvv> e;

   public fvy() {
      this(fip.Q().L().l());
   }

   public fvy(Collection<gbx> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != deg.d).sorted(b).map($$0x -> new fvr($$0x.a())).toList();
   }

   @Override
   public List<fvv> a() {
      return this.e;
   }

   @Override
   public xe b() {
      return d;
   }

   @Override
   public void a(fvt $$0) {
      $$0.a(this);
   }

   @Override
   public xe aT_() {
      return c;
   }

   @Override
   public void a(fkb $$0, float $$1, float $$2) {
      $$0.a(ghv::B, a, 0, 0, 16, 16, axq.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.e.isEmpty();
   }
}
