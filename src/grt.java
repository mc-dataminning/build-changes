import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class grt extends avm<grt.a> {
   private static final Logger a = LogUtils.getLogger();
   private static final alk b = alk.b("gpu_warnlist.json");
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

   public void c() {
      this.d = true;
   }

   public void d() {
      this.e = true;
   }

   public void e() {
      this.e = true;
      this.f = true;
   }

   public boolean f() {
      return this.d && !this.e;
   }

   public boolean g() {
      return this.f;
   }

   public void h() {
      this.d = false;
      this.e = false;
      this.f = false;
   }

   @Nullable
   public String i() {
      return (String)this.c.get("renderer");
   }

   @Nullable
   public String j() {
      return (String)this.c.get("version");
   }

   @Nullable
   public String k() {
      return (String)this.c.get("vendor");
   }

   @Nullable
   public String l() {
      StringBuilder $$0 = new StringBuilder();
      this.c.forEach(($$1, $$2) -> $$0.append($$1).append(": ").append($$2));
      return $$0.length() == 0 ? null : $$0.toString();
   }

   protected grt.a a(avh $$0, brd $$1) {
      List<Pattern> $$2 = Lists.newArrayList();
      List<Pattern> $$3 = Lists.newArrayList();
      List<Pattern> $$4 = Lists.newArrayList();
      JsonObject $$5 = c($$0, $$1);
      if ($$5 != null) {
         try (bri $$6 = $$1.d("compile_regex")) {
            a($$5.getAsJsonArray("renderer"), $$2);
            a($$5.getAsJsonArray("version"), $$3);
            a($$5.getAsJsonArray("vendor"), $$4);
         }
      }

      return new grt.a($$2, $$3, $$4);
   }

   protected void a(grt.a $$0, avh $$1, brd $$2) {
      this.c = $$0.a();
   }

   private static void a(JsonArray $$0, List<Pattern> $$1) {
      $$0.forEach($$1x -> $$1.add(Pattern.compile($$1x.getAsString(), 2)));
   }

   @Nullable
   private static JsonObject c(avh $$0, brd $$1) {
      try {
         JsonObject var4;
         try (
            bri $$2 = $$1.d("parse_json");
            Reader $$3 = $$0.openAsReader(b);
         ) {
            var4 = JsonParser.parseReader($$3).getAsJsonObject();
         }

         return var4;
      } catch (JsonSyntaxException | IOException var10) {
         a.warn("Failed to load GPU warnlist");
         return null;
      }
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
         flc $$1 = RenderSystem.getDevice();
         if ($$1.h().equals("OpenGL")) {
            String $$2 = a(this.a, $$1.f());
            if (!$$2.isEmpty()) {
               $$0.put("renderer", $$2);
            }

            String $$3 = a(this.b, $$1.i());
            if (!$$3.isEmpty()) {
               $$0.put("version", $$3);
            }

            String $$4 = a(this.c, $$1.g());
            if (!$$4.isEmpty()) {
               $$0.put("vendor", $$4);
            }
         }

         return $$0.build();
      }
   }
}
