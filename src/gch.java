import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class gch {
   public final Int2ObjectMap<gqd> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gpw> b = new Int2ObjectOpenHashMap(256);
   private final gqc c;

   public gch(gqc $$0) {
      this.c = $$0;
   }

   public gpw a(cto $$0) {
      gpw $$1 = this.a($$0.g());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gpw a(ctj $$0) {
      return (gpw)this.b.get(b($$0));
   }

   private static int b(ctj $$0) {
      return ctj.a($$0);
   }

   public void a(ctj $$0, gqd $$1) {
      this.a.put(b($$0), $$1);
   }

   public gqc a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gqd> $$0 = (Entry<Integer, gqd>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
