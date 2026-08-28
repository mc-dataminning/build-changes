import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gdz implements gdv, gdw {
   private static final alg a = alg.b("spectator/teleport_to_player");
   private static final Comparator<gkl> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wy c = wy.c("spectatorMenu.teleport");
   private static final wy d = wy.c("spectatorMenu.teleport.prompt");
   private final List<gdw> e;

   public gdz() {
      this(foz.Q().L().l());
   }

   public gdz(Collection<gkl> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dix.d).sorted(b).map($$0x -> new gds($$0x.a())).toList();
   }

   @Override
   public List<gdw> a() {
      return this.e;
   }

   @Override
   public wy b() {
      return d;
   }

   @Override
   public void a(gdu $$0) {
      $$0.a(this);
   }

   @Override
   public wy aP_() {
      return c;
   }

   @Override
   public void a(frv $$0, float $$1, float $$2) {
      $$0.a(gqk::H, a, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aQ_() {
      return !this.e.isEmpty();
   }
}
