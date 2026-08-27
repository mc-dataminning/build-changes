import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gls extends asg<gls.a> {
   public static final gkl a = new gkl("minecraft:empty", bkx.a(1.0F), bkx.a(1.0F), 1, gkl.a.a, false, false, 16);
   public static final aiy b = new aiy("minecraft", "intentionally_empty");
   public static final glt c = new glt(b, null);
   public static final gkl d = new gkl(b.toString(), bkx.a(1.0F), bkx.a(1.0F), 1, gkl.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vq.class, new vq.b()).registerTypeAdapter(gkm.class, new gkn()).create();
   private static final TypeToken<Map<String, gkm>> h = new TypeToken<Map<String, gkm>>() {
   };
   private final Map<aiy, glt> i = Maps.newHashMap();
   private final glp j;
   private final Map<aiy, arz> k = new HashMap<>();

   public gls(exs $$0) {
      this.j = new glp(this, $$0, ase.fromMap(this.k));
   }

   protected gls.a a(asb $$0, bin $$1) {
      gls.a $$2 = new gls.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (arz $$5 : $$0.a(new aiy($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gkm> $$7 = avy.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gkm> $$8 : $$7.entrySet()) {
                     $$2.a(new aiy($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  e.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
               }

               $$1.c();
            }
         } catch (IOException var16) {
         }

         $$1.c();
      }

      $$1.b();
      return $$2;
   }

   protected void a(gls.a $$0, asb $$1, bin $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aU) {
         for (aiy $$3 : this.i.keySet()) {
            glt $$4 = this.i.get($$3);
            if (!vt.b($$4.a()) && kf.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aiy $$5 : this.i.keySet()) {
            if (!kf.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public eqe b() {
      return this.j.i();
   }

   static boolean a(gkl $$0, aiy $$1, ase $$2) {
      aiy $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public glt a(aiy $$0) {
      return this.i.get($$0);
   }

   public Collection<aiy> d() {
      return this.i.keySet();
   }

   public void a(gkp $$0) {
      this.j.a($$0);
   }

   public void a(gko $$0) {
      this.j.c($$0);
   }

   public void a(gko $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(ewz $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.e();
   }

   public void f() {
      this.j.d();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void i() {
      this.j.f();
   }

   public void a(atm $$0, float $$1) {
      if ($$0 == atm.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gko $$0) {
      this.j.a($$0);
   }

   public boolean c(gko $$0) {
      return this.j.b($$0);
   }

   public void a(glr $$0) {
      this.j.a($$0);
   }

   public void b(glr $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aiy $$0, @Nullable atm $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<aiy, glt> a = Maps.newHashMap();
      private Map<aiy, arz> b = Map.of();

      void a(asb $$0) {
         this.b = gkl.a.a($$0);
      }

      void a(aiy $$0, gkm $$1) {
         glt $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gls.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new glt($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         ase $$4 = ase.fromMap(this.b);

         for (final gkl $$5 : $$1.a()) {
            final aiy $$6 = $$5.a();
            glu<gkl> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gls.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new glu<gkl>() {
                     @Override
                     public int e() {
                        glt $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gkl a(awp $$0) {
                        glt $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gls.a;
                        } else {
                           gkl $$2 = $$1.a($$0);
                           return new gkl(
                              $$2.a().toString(), new bld($$2.c(), $$5.c()), new bld($$2.d(), $$5.d()), $$5.e(), gkl.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(glp $$0) {
                        glt $$1 = a.this.a.get($$6);
                        if ($$1 != null) {
                           $$1.a($$0);
                        }
                     }
                  };
                  break;
               default:
                  throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
            }

            $$2.a($$8);
         }
      }

      public void a(Map<aiy, glt> $$0, Map<aiy, arz> $$1, glp $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aiy, glt> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
