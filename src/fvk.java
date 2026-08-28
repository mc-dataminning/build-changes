import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fvk implements fvg, fvh {
   private static final alb a = alb.b("spectator/teleport_to_player");
   private static final Comparator<gbi> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xd c = xd.c("spectatorMenu.teleport");
   private static final xd d = xd.c("spectatorMenu.teleport.prompt");
   private final List<fvh> e;

   public fvk() {
      this(fib.Q().L().l());
   }

   public fvk(Collection<gbi> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != ddp.d).sorted(b).map($$0x -> new fvd($$0x.a())).toList();
   }

   @Override
   public List<fvh> a() {
      return this.e;
   }

   @Override
   public xd b() {
      return d;
   }

   @Override
   public void a(fvf $$0) {
      $$0.a(this);
   }

   @Override
   public xd aU_() {
      return c;
   }

   @Override
   public void a(fjn $$0, float $$1, float $$2) {
      $$0.a(ghe::C, a, 0, 0, 16, 16, axn.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aV_() {
      return !this.e.isEmpty();
   }
}
