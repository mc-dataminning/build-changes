import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ggb implements gfx, gfy {
   private static final ali a = ali.b("spectator/teleport_to_player");
   private static final Comparator<gmn> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xa c = xa.c("spectatorMenu.teleport");
   private static final xa d = xa.c("spectatorMenu.teleport.prompt");
   private final List<gfy> e;

   public ggb() {
      this(frd.Q().L().l());
   }

   public ggb(Collection<gmn> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dju.d).sorted(b).map($$0x -> new gfu($$0x.a())).toList();
   }

   @Override
   public List<gfy> a() {
      return this.e;
   }

   @Override
   public xa b() {
      return d;
   }

   @Override
   public void a(gfw $$0) {
      $$0.a(this);
   }

   @Override
   public xa aT_() {
      return c;
   }

   @Override
   public void a(ftx $$0, float $$1, float $$2) {
      $$0.a(gsl::H, a, 0, 0, 16, 16, axy.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aU_() {
      return !this.e.isEmpty();
   }
}
