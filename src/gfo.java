import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gfo implements gfk, gfl {
   private static final alr a = alr.b("spectator/teleport_to_player");
   private static final Comparator<gma> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xg c = xg.c("spectatorMenu.teleport");
   private static final xg d = xg.c("spectatorMenu.teleport.prompt");
   private final List<gfl> e;

   public gfo() {
      this(fqq.Q().L().k());
   }

   public gfo(Collection<gma> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dkg.d).sorted(b).map($$0x -> new gfh($$0x.a())).toList();
   }

   @Override
   public List<gfl> a() {
      return this.e;
   }

   @Override
   public xg b() {
      return d;
   }

   @Override
   public void a(gfj $$0) {
      $$0.a(this);
   }

   @Override
   public xg aP_() {
      return c;
   }

   @Override
   public void a(ftk $$0, float $$1, float $$2) {
      $$0.a(gry::H, a, 0, 0, 16, 16, ayh.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aQ_() {
      return !this.e.isEmpty();
   }
}
