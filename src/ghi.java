import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class ghi implements bpy {
   private final gid a;
   private final Set<bpw> b = new ObjectOpenHashSet();
   private final bqe c = new bqe();

   public ghi(LongSupplier $$0, gid $$1) {
      this.a = $$1;
      this.b.add(bqf.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bqf.a());
      this.b.add(bpw.a("totalChunks", bpv.f, this.a, gid::h));
      this.b.add(bpw.a("renderedChunks", bpv.f, this.a, gid::j));
      this.b.add(bpw.a("lastViewDistance", bpv.f, this.a, gid::i));
      glu $$0 = this.a.g();
      this.b.add(bpw.a("toUpload", bpv.g, $$0, glu::c));
      this.b.add(bpw.a("freeBufferCount", bpv.g, $$0, glu::d));
      this.b.add(bpw.a("toBatchCount", bpv.g, $$0, glu::b));
      if (fdu.a().isPresent()) {
         this.b.add(bpw.a("gpuUtilization", bpv.i, fji.Q(), fji::v));
      }
   }

   @Override
   public Set<bpw> a(Supplier<bok> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
