import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gky implements bqd {
   private final glr a;
   private final Set<bqb> b = new ObjectOpenHashSet();
   private final bqj c = new bqj();

   public gky(LongSupplier $$0, glr $$1) {
      this.a = $$1;
      this.b.add(bqk.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bqk.a());
      this.b.add(bqb.a("totalChunks", bqa.f, this.a, glr::h));
      this.b.add(bqb.a("renderedChunks", bqa.f, this.a, glr::j));
      this.b.add(bqb.a("lastViewDistance", bqa.f, this.a, glr::i));
      gpj $$0 = this.a.g();
      this.b.add(bqb.a("toUpload", bqa.g, $$0, gpj::c));
      this.b.add(bqb.a("freeBufferCount", bqa.g, $$0, gpj::d));
      this.b.add(bqb.a("toBatchCount", bqa.g, $$0, gpj::b));
      if (ffl.a().isPresent()) {
         this.b.add(bqb.a("gpuUtilization", bqa.i, flh.Q(), flh::v));
      }
   }

   @Override
   public Set<bqb> a(Supplier<boo> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
