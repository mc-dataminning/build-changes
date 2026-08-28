import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class gds implements gdo, gdp {
   private static final alg a = alg.b("spectator/teleport_to_player");
   private static final Comparator<gkd> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wy c = wy.c("spectatorMenu.teleport");
   private static final wy d = wy.c("spectatorMenu.teleport.prompt");
   private final List<gdp> e;

   public gds() {
      this(fos.Q().L().l());
   }

   public gds(Collection<gkd> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dis.d).sorted(b).map($$0x -> new gdl($$0x.a())).toList();
   }

   @Override
   public List<gdp> a() {
      return this.e;
   }

   @Override
   public wy b() {
      return d;
   }

   @Override
   public void a(gdn $$0) {
      $$0.a(this);
   }

   @Override
   public wy aO_() {
      return c;
   }

   @Override
   public void a(fro $$0, float $$1, float $$2) {
      $$0.a(gqc::H, a, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
