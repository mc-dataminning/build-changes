import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class ggm implements bpp {
   private final ghh a;
   private final Set<bpn> b = new ObjectOpenHashSet();
   private final bpv c = new bpv();

   public ggm(LongSupplier $$0, ghh $$1) {
      this.a = $$1;
      this.b.add(bpw.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bpw.a());
      this.b.add(bpn.a("totalChunks", bpm.f, this.a, ghh::h));
      this.b.add(bpn.a("renderedChunks", bpm.f, this.a, ghh::j));
      this.b.add(bpn.a("lastViewDistance", bpm.f, this.a, ghh::i));
      gky $$0 = this.a.g();
      this.b.add(bpn.a("toUpload", bpm.g, $$0, gky::c));
      this.b.add(bpn.a("freeBufferCount", bpm.g, $$0, gky::d));
      this.b.add(bpn.a("toBatchCount", bpm.g, $$0, gky::b));
      if (fdb.a().isPresent()) {
         this.b.add(bpn.a("gpuUtilization", bpm.i, fip.Q(), fip::v));
      }
   }

   @Override
   public Set<bpn> a(Supplier<boe> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
