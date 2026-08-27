import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gfd {
   public final Int2ObjectMap<gtg> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gsz> b = new Int2ObjectOpenHashMap(256);
   private final gtf c;

   public gfd(gtf $$0) {
      this.c = $$0;
   }

   public gsz a(cuh $$0) {
      gsz $$1 = this.a($$0.f());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gsz a(cuc $$0) {
      return (gsz)this.b.get(b($$0));
   }

   private static int b(cuc $$0) {
      return cuc.a($$0);
   }

   public void a(cuc $$0, gtg $$1) {
      this.a.put(b($$0), $$1);
   }

   public gtf a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gtg> $$0 = (Entry<Integer, gtg>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
