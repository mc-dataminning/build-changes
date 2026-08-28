import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fwu implements fwq, fwr {
   private static final ali a = ali.b("spectator/teleport_to_player");
   private static final Comparator<gct> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final xi c = xi.c("spectatorMenu.teleport");
   private static final xi d = xi.c("spectatorMenu.teleport.prompt");
   private final List<fwr> e;

   public fwu() {
      this(fji.Q().L().l());
   }

   public fwu(Collection<gct> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dey.d).sorted(b).map($$0x -> new fwn($$0x.a())).toList();
   }

   @Override
   public List<fwr> a() {
      return this.e;
   }

   @Override
   public xi b() {
      return d;
   }

   @Override
   public void a(fwp $$0) {
      $$0.a(this);
   }

   @Override
   public xi aS_() {
      return c;
   }

   @Override
   public void a(fku $$0, float $$1, float $$2) {
      $$0.a(gir::B, a, 0, 0, 16, 16, axv.a($$2, $$1, $$1, $$1));
   }

   @Override
   public boolean aT_() {
      return !this.e.isEmpty();
   }
}
