import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcm {
   private static final Logger a = LogUtils.getLogger();
   private static final bqo b = new bqo(ad.g(), "server-list-io");
   private static final int c = 16;
   private final fja d;
   private final List<gcl> e = Lists.newArrayList();
   private final List<gcl> f = Lists.newArrayList();

   public gcm(fja $$0) {
      this.d = $$0;
   }

   public void a() {
      try {
         this.e.clear();
         this.f.clear();
         uj $$0 = uw.a(this.d.q.toPath().resolve("servers.dat"));
         if ($$0 == null) {
            return;
         }

         up $$1 = $$0.c("servers", 10);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            uj $$3 = $$1.a($$2);
            gcl $$4 = gcl.a($$3);
            if ($$3.q("hidden")) {
               this.f.add($$4);
            } else {
               this.e.add($$4);
            }
         }
      } catch (Exception var6) {
         a.error("Couldn't load server list", var6);
      }
   }

   public void b() {
      try {
         up $$0 = new up();

         for (gcl $$1 : this.e) {
            uj $$2 = $$1.a();
            $$2.a("hidden", false);
            $$0.add($$2);
         }

         for (gcl $$3 : this.f) {
            uj $$4 = $$3.a();
            $$4.a("hidden", true);
            $$0.add($$4);
         }

         uj $$5 = new uj();
         $$5.a("servers", $$0);
         Path $$6 = this.d.q.toPath();
         Path $$7 = Files.createTempFile($$6, "servers", ".dat");
         uw.b($$5, $$7);
         Path $$8 = $$6.resolve("servers.dat_old");
         Path $$9 = $$6.resolve("servers.dat");
         ad.a($$9, $$7, $$8);
      } catch (Exception var7) {
         a.error("Couldn't save server list", var7);
      }
   }

   public gcl a(int $$0) {
      return this.e.get($$0);
   }

   @Nullable
   public gcl a(String $$0) {
      for (gcl $$1 : this.e) {
         if ($$1.b.equals($$0)) {
            return $$1;
         }
      }

      for (gcl $$2 : this.f) {
         if ($$2.b.equals($$0)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public gcl b(String $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         gcl $$2 = this.f.get($$1);
         if ($$2.b.equals($$0)) {
            this.f.remove($$1);
            this.e.add($$2);
            return $$2;
         }
      }

      return null;
   }

   public void a(gcl $$0) {
      if (!this.e.remove($$0)) {
         this.f.remove($$0);
      }
   }

   public void a(gcl $$0, boolean $$1) {
      if ($$1) {
         this.f.add(0, $$0);

         while (this.f.size() > 16) {
            this.f.remove(this.f.size() - 1);
         }
      } else {
         this.e.add($$0);
      }
   }

   public int c() {
      return this.e.size();
   }

   public void a(int $$0, int $$1) {
      gcl $$2 = this.a($$0);
      this.e.set($$0, this.a($$1));
      this.e.set($$1, $$2);
      this.b();
   }

   public void a(int $$0, gcl $$1) {
      this.e.set($$0, $$1);
   }

   private static boolean a(gcl $$0, List<gcl> $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         gcl $$3 = $$1.get($$2);
         if ($$3.a.equals($$0.a) && $$3.b.equals($$0.b)) {
            $$1.set($$2, $$0);
            return true;
         }
      }

      return false;
   }

   public static void b(gcl $$0) {
      b.a_(() -> {
         gcm $$1 = new gcm(fja.Q());
         $$1.a();
         if (!a($$0, $$1.e)) {
            a($$0, $$1.f);
         }

         $$1.b();
      });
   }
}
