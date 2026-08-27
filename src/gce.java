import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gce extends auc<gce.a> {
   private static final Logger a = LogUtils.getLogger();
   private static final akn b = new akn("gpu_warnlist.json");
   private ImmutableMap<String, String> c = ImmutableMap.of();
   private boolean d;
   private boolean e;
   private boolean f;

   public boolean a() {
      return !this.c.isEmpty();
   }

   public boolean b() {
      return this.a() && !this.e;
   }

   public void d() {
      this.d = true;
   }

   public void e() {
      this.e = true;
   }

   public void f() {
      this.e = true;
      this.f = true;
   }

   public boolean g() {
      return this.d && !this.e;
   }

   public boolean h() {
      return this.f;
   }

   public void i() {
      this.d = false;
      this.e = false;
      this.f = false;
   }

   @Nullable
   public String j() {
      return (String)this.c.get("renderer");
   }

   @Nullable
   public String k() {
      return (String)this.c.get("version");
   }

   @Nullable
   public String l() {
      return (String)this.c.get("vendor");
   }

   @Nullable
   public String m() {
      StringBuilder $$0 = new StringBuilder();
      this.c.forEach(($$1, $$2) -> $$0.append($$1).append(": ").append($$2));
      return $$0.length() == 0 ? null : $$0.toString();
   }

   protected gce.a a(atx $$0, bmk $$1) {
      List<Pattern> $$2 = Lists.newArrayList();
      List<Pattern> $$3 = Lists.newArrayList();
      List<Pattern> $$4 = Lists.newArrayList();
      $$1.a();
      JsonObject $$5 = c($$0, $$1);
      if ($$5 != null) {
         $$1.a("compile_regex");
         a($$5.getAsJsonArray("renderer"), $$2);
         a($$5.getAsJsonArray("version"), $$3);
         a($$5.getAsJsonArray("vendor"), $$4);
         $$1.c();
      }

      $$1.b();
      return new gce.a($$2, $$3, $$4);
   }

   protected void a(gce.a $$0, atx $$1, bmk $$2) {
      this.c = $$0.a();
   }

   private static void a(JsonArray $$0, List<Pattern> $$1) {
      $$0.forEach($$1x -> $$1.add(Pattern.compile($$1x.getAsString(), 2)));
   }

   @Nullable
   private static JsonObject c(atx $$0, bmk $$1) {
      $$1.a("parse_json");
      JsonObject $$2 = null;

      try (Reader $$3 = $$0.openAsReader(b)) {
         $$2 = JsonParser.parseReader($$3).getAsJsonObject();
      } catch (JsonSyntaxException | IOException var8) {
         a.warn("Failed to load GPU warnlist");
      }

      $$1.c();
      return $$2;
   }

   protected static final class a {
      private final List<Pattern> a;
      private final List<Pattern> b;
      private final List<Pattern> c;

      a(List<Pattern> $$0, List<Pattern> $$1, List<Pattern> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      private static String a(List<Pattern> $$0, String $$1) {
         List<String> $$2 = Lists.newArrayList();

         for (Pattern $$3 : $$0) {
            Matcher $$4 = $$3.matcher($$1);

            while ($$4.find()) {
               $$2.add($$4.group());
            }
         }

         return String.join(", ", $$2);
      }

      ImmutableMap<String, String> a() {
         Builder<String, String> $$0 = new Builder();
         String $$1 = a(this.a, exn.c());
         if (!$$1.isEmpty()) {
            $$0.put("renderer", $$1);
         }

         String $$2 = a(this.b, exn.d());
         if (!$$2.isEmpty()) {
            $$0.put("version", $$2);
         }

         String $$3 = a(this.c, exn.a());
         if (!$$3.isEmpty()) {
            $$0.put("vendor", $$3);
         }

         return $$0.build();
      }
   }
}
