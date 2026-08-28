import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class geq implements gem, gen {
   private static final alg a = alg.b("spectator/teleport_to_player");
   private static final Comparator<glc> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wy c = wy.c("spectatorMenu.teleport");
   private static final wy d = wy.c("spectatorMenu.teleport.prompt");
   private final List<gen> e;

   public geq() {
      this(fpt.Q().L().l());
   }

   public geq(Collection<glc> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != djj.d).sorted(b).map($$0x -> new gej($$0x.a())).toList();
   }

   @Override
   public List<gen> a() {
      return this.e;
   }

   @Override
   public wy b() {
      return d;
   }

   @Override
   public void a(gel $$0) {
      $$0.a(this);
   }

   @Override
   public wy aP_() {
      return c;
   }

   @Override
   public void a(fsm $$0, float $$1, float $$2) {
      $$0.a(grc::H, a, 0, 0, 16, 16, axw.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aQ_() {
      return !this.e.isEmpty();
   }
}
