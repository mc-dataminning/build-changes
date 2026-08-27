import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fzw {
   public final Int2ObjectMap<gnq> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gnj> b = new Int2ObjectOpenHashMap(256);
   private final gnp c;

   public fzw(gnp $$0) {
      this.c = $$0;
   }

   public gnj a(crj $$0) {
      gnj $$1 = this.a($$0.f());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gnj a(cre $$0) {
      return (gnj)this.b.get(b($$0));
   }

   private static int b(cre $$0) {
      return cre.a($$0);
   }

   public void a(cre $$0, gnq $$1) {
      this.a.put(b($$0), $$1);
   }

   public gnp a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gnq> $$0 = (Entry<Integer, gnq>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
