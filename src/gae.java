import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gae implements gaa, gab {
   private static final aku a = aku.b("spectator/teleport_to_player");
   private static final Comparator<ggi> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wo c = wo.c("spectatorMenu.teleport");
   private static final wo d = wo.c("spectatorMenu.teleport.prompt");
   private final List<gab> e;

   public gae() {
      this(flh.Q().L().l());
   }

   public gae(Collection<ggi> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dgd.d).sorted(b).map($$0x -> new fzx($$0x.a())).toList();
   }

   @Override
   public List<gab> a() {
      return this.e;
   }

   @Override
   public wo b() {
      return d;
   }

   @Override
   public void a(fzz $$0) {
      $$0.a(this);
   }

   @Override
   public wo aS_() {
      return c;
   }

   @Override
   public void a(fob $$0, float $$1, float $$2) {
      $$0.a(gmf::H, a, 0, 0, 16, 16, axj.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.e.isEmpty();
   }
}
