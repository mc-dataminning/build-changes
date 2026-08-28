import com.google.common.collect.Queues;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hp<T> implements AutoCloseable {
   private static final int a = 10000000;
   private static final Logger b = LogUtils.getLogger();
   private final int c;
   private final int d;
   private final bmr e;
   @Nullable
   private hs f;
   private int g;
   private boolean h;
   private final Deque<hl<T>> i = Queues.newArrayDeque();
   private final List<hl<T>> j = new ObjectArrayList();
   private int k;

   public hp(int $$0, int $$1, bmr $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.g = $$0;
   }

   private static <T extends es<T>> hr a(hp<T> $$0, en $$1) {
      if ($$0.k == 0) {
         return new hr(0, $$1, $$0.i::clear);
      } else {
         int $$2 = $$0.k + 1;
         return new hr($$2, $$1, $$0.b($$2));
      }
   }

   public static <T extends es<T>> void a(hp<T> $$0, ie<T> $$1, T $$2, en $$3) {
      $$0.a(new hl<>(a($$0, $$3), new hw<>($$1, $$2.p(), false).bind($$2)));
   }

   public static <T extends es<T>> void a(hp<T> $$0, String $$1, ContextChain<T> $$2, T $$3, en $$4) {
      $$0.a(new hl<>(a($$0, $$4), new hv.b<>($$1, $$2, $$3)));
   }

   private void f() {
      this.h = true;
      this.j.clear();
      this.i.clear();
   }

   public void a(hl<T> $$0) {
      if (this.j.size() + this.i.size() > 10000000) {
         this.f();
      }

      if (!this.h) {
         this.j.add($$0);
      }
   }

   public void a(int $$0) {
      while (!this.i.isEmpty() && this.i.peek().a().c() >= $$0) {
         this.i.removeFirst();
      }
   }

   public hr.a b(int $$0) {
      return () -> this.a($$0);
   }

   public void a() {
      this.g();

      while (true) {
         if (this.g <= 0) {
            b.info("Command execution stopped due to limit (executed {} commands)", this.c);
            break;
         }

         hl<T> $$0 = this.i.pollFirst();
         if ($$0 == null) {
            return;
         }

         this.k = $$0.a().c();
         $$0.a(this);
         if (this.h) {
            b.error("Command execution stopped due to command queue overflow (max {})", 10000000);
            break;
         }

         this.g();
      }

      this.k = 0;
   }

   private void g() {
      for (int $$0 = this.j.size() - 1; $$0 >= 0; $$0--) {
         this.i.addFirst(this.j.get($$0));
      }

      this.j.clear();
   }

   public void a(@Nullable hs $$0) {
      this.f = $$0;
   }

   @Nullable
   public hs b() {
      return this.f;
   }

   public bmr c() {
      return this.e;
   }

   public int d() {
      return this.d;
   }

   public void e() {
      this.g--;
   }

   @Override
   public void close() {
      if (this.f != null) {
         this.f.close();
      }
   }
}
