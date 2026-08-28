import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gme {
   private static final Logger a = LogUtils.getLogger();
   private static final btr b = new btr(ag.h(), "server-list-io");
   private static final int c = 16;
   private final fqq d;
   private final List<gmd> e = Lists.newArrayList();
   private final List<gmd> f = Lists.newArrayList();

   public gme(fqq $$0) {
      this.d = $$0;
   }

   public void a() {
      try {
         this.e.clear();
         this.f.clear();
         ua $$0 = un.a(this.d.q.toPath().resolve("servers.dat"));
         if ($$0 == null) {
            return;
         }

         $$0.p("servers").j().forEach($$0x -> {
            gmd $$1x = gmd.a($$0x);
            if ($$0x.b("hidden", false)) {
               this.f.add($$1x);
            } else {
               this.e.add($$1x);
            }
         });
      } catch (Exception var2) {
         a.error("Couldn't load server list", var2);
      }
   }

   public void b() {
      try {
         ug $$0 = new ug();

         for (gmd $$1 : this.e) {
            ua $$2 = $$1.a();
            $$2.a("hidden", false);
            $$0.add($$2);
         }

         for (gmd $$3 : this.f) {
            ua $$4 = $$3.a();
            $$4.a("hidden", true);
            $$0.add($$4);
         }

         ua $$5 = new ua();
         $$5.a("servers", $$0);
         Path $$6 = this.d.q.toPath();
         Path $$7 = Files.createTempFile($$6, "servers", ".dat");
         un.b($$5, $$7);
         Path $$8 = $$6.resolve("servers.dat_old");
         Path $$9 = $$6.resolve("servers.dat");
         ag.a($$9, $$7, $$8);
      } catch (Exception var7) {
         a.error("Couldn't save server list", var7);
      }
   }

   public gmd a(int $$0) {
      return this.e.get($$0);
   }

   @Nullable
   public gmd a(String $$0) {
      for (gmd $$1 : this.e) {
         if ($$1.b.equals($$0)) {
            return $$1;
         }
      }

      for (gmd $$2 : this.f) {
         if ($$2.b.equals($$0)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public gmd b(String $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         gmd $$2 = this.f.get($$1);
         if ($$2.b.equals($$0)) {
            this.f.remove($$1);
            this.e.add($$2);
            return $$2;
         }
      }

      return null;
   }

   public void a(gmd $$0) {
      if (!this.e.remove($$0)) {
         this.f.remove($$0);
      }
   }

   public void a(gmd $$0, boolean $$1) {
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
      gmd $$2 = this.a($$0);
      this.e.set($$0, this.a($$1));
      this.e.set($$1, $$2);
      this.b();
   }

   public void a(int $$0, gmd $$1) {
      this.e.set($$0, $$1);
   }

   private static boolean a(gmd $$0, List<gmd> $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         gmd $$3 = $$1.get($$2);
         if (Objects.equals($$3.a, $$0.a) && $$3.b.equals($$0.b)) {
            $$1.set($$2, $$0);
            return true;
         }
      }

      return false;
   }

   public static void b(gmd $$0) {
      b.a_(() -> {
         gme $$1 = new gme(fqq.Q());
         $$1.a();
         if (!a($$0, $$1.e)) {
            a($$0, $$1.f);
         }

         $$1.b();
      });
   }
}
