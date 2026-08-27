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

public class gds extends aoa<gds.a> {
   public static final gcl a = new gcl("minecraft:empty", bgb.a(1.0F), bgb.a(1.0F), 1, gcl.a.a, false, false, 16);
   public static final aey b = new aey("minecraft", "intentionally_empty");
   public static final gdt c = new gdt(b, null);
   public static final gcl d = new gcl(b.toString(), bgb.a(1.0F), bgb.a(1.0F), 1, gcl.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(tn.class, new tn.a()).registerTypeAdapter(gcm.class, new gcn()).create();
   private static final TypeToken<Map<String, gcm>> h = new TypeToken<Map<String, gcm>>() {
   };
   private final Map<aey, gdt> i = Maps.newHashMap();
   private final gdp j;
   private final Map<aey, ant> k = new HashMap<>();

   public gds(erb $$0) {
      this.j = new gdp(this, $$0, any.fromMap(this.k));
   }

   protected gds.a a(anv $$0, bdr $$1) {
      gds.a $$2 = new gds.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (ant $$5 : $$0.a(new aey($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gcm> $$7 = arp.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gcm> $$8 : $$7.entrySet()) {
                     $$2.a(new aey($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gds.a $$0, anv $$1, bdr $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aT) {
         for (aey $$3 : this.i.keySet()) {
            gdt $$4 = this.i.get($$3);
            if (!tp.b($$4.a()) && jd.c.c($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (aey $$5 : this.i.keySet()) {
            if (!jd.c.c($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.g();
   }

   static boolean a(gcl $$0, aey $$1, any $$2) {
      aey $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gdt a(aey $$0) {
      return this.i.get($$0);
   }

   public Collection<aey> b() {
      return this.i.keySet();
   }

   public void a(gcp $$0) {
      this.j.a($$0);
   }

   public void a(gco $$0) {
      this.j.c($$0);
   }

   public void a(gco $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eqi $$0) {
      this.j.a($$0);
   }

   public void d() {
      this.j.d();
   }

   public void e() {
      this.j.c();
   }

   public void f() {
      this.j.b();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void g() {
      this.j.e();
   }

   public void a(apg $$0, float $$1) {
      if ($$0 == apg.a && $$1 <= 0.0F) {
         this.e();
      }

      this.j.a($$0, $$1);
   }

   public void b(gco $$0) {
      this.j.a($$0);
   }

   public boolean c(gco $$0) {
      return this.j.b($$0);
   }

   public void a(gdr $$0) {
      this.j.a($$0);
   }

   public void b(gdr $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable aey $$0, @Nullable apg $$1) {
      this.j.a($$0, $$1);
   }

   public String h() {
      return this.j.f();
   }

   public void i() {
      this.j.a();
   }

   protected static class a {
      final Map<aey, gdt> a = Maps.newHashMap();
      private Map<aey, ant> b = Map.of();

      void a(anv $$0) {
         this.b = gcl.a.a($$0);
      }

      void a(aey $$0, gcm $$1) {
         gdt $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gds.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gdt($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         any $$4 = any.fromMap(this.b);

         for (final gcl $$5 : $$1.a()) {
            final aey $$6 = $$5.a();
            gdu<gcl> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gds.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gdu<gcl>() {
                     @Override
                     public int e() {
                        gdt $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gcl a(ase $$0) {
                        gdt $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gds.a;
                        } else {
                           gcl $$2 = $$1.a($$0);
                           return new gcl(
                              $$2.a().toString(), new bgh($$2.c(), $$5.c()), new bgh($$2.d(), $$5.d()), $$5.e(), gcl.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gdp $$0) {
                        gdt $$1 = a.this.a.get($$6);
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

      public void a(Map<aey, gdt> $$0, Map<aey, ant> $$1, gdp $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<aey, gdt> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
