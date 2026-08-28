import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fzn implements fzj, fzk {
   private static final alp a = alp.b("spectator/teleport_to_player");
   private static final Comparator<gfr> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xk c = xk.c("spectatorMenu.teleport");
   private static final xk d = xk.c("spectatorMenu.teleport.prompt");
   private final List<fzk> e;

   public fzn() {
      this(flz.Q().L().l());
   }

   public fzn(Collection<gfr> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dgw.d).sorted(b).map($$0x -> new fzg($$0x.a())).toList();
   }

   @Override
   public List<fzk> a() {
      return this.e;
   }

   @Override
   public xk b() {
      return d;
   }

   @Override
   public void a(fzi $$0) {
      $$0.a(this);
   }

   @Override
   public xk aU_() {
      return c;
   }

   @Override
   public void a(fnl $$0, float $$1, float $$2) {
      $$0.a(glq::H, a, 0, 0, 16, 16, ayf.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aV_() {
      return !this.e.isEmpty();
   }
}
