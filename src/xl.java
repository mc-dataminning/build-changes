import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xl(xm j, xm k) {
   public static final Codec<xl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xm.a.fieldOf("chat").forGetter(xl::a), xm.a.fieldOf("narration").forGetter(xl::b)).apply($$0, xl::new)
   );
   public static final xm b = xm.a("chat.type.text");
   public static final ale<xl> c = a("chat");
   public static final ale<xl> d = a("say_command");
   public static final ale<xl> e = a("msg_command_incoming");
   public static final ale<xl> f = a("msg_command_outgoing");
   public static final ale<xl> g = a("team_msg_command_incoming");
   public static final ale<xl> h = a("team_msg_command_outgoing");
   public static final ale<xl> i = a("emote_command");

   private static ale<xl> a(String $$0) {
      return ale.a(lq.aA, new alf($$0));
   }

   public static void a(rc<xl> $$0) {
      $$0.a(c, new xl(b, xm.a("chat.type.text.narrate")));
      $$0.a(d, new xl(xm.a("chat.type.announcement"), xm.a("chat.type.text.narrate")));
      $$0.a(e, new xl(xm.b("commands.message.display.incoming"), xm.a("chat.type.text.narrate")));
      $$0.a(f, new xl(xm.c("commands.message.display.outgoing"), xm.a("chat.type.text.narrate")));
      $$0.a(g, new xl(xm.d("chat.type.team.text"), xm.a("chat.type.text.narrate")));
      $$0.a(h, new xl(xm.d("chat.type.team.sent"), xm.a("chat.type.text.narrate")));
      $$0.a(i, new xl(xm.a("chat.type.emote"), xm.a("chat.type.emote")));
   }

   public static xl.a a(ale<xl> $$0, bsw $$1) {
      return a($$0, $$1.dP().H_(), $$1.O_());
   }

   public static xl.a a(ale<xl> $$0, ep $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xl.a a(ale<xl> $$0, jw $$1, xp $$2) {
      jv<xl> $$3 = $$1.d(lq.aA);
      return new xl.a($$3.g($$0), $$2);
   }

   public xm a() {
      return this.j;
   }

   public xm b() {
      return this.k;
   }

   public static record a(ji<xl> b, xp c, Optional<xp> d) {
      public static final zn<xa, xl.a> a = zn.a(zl.b(lq.aA), xl.a::a, xr.d, xl.a::b, xr.e, xl.a::c, xl.a::new);

      a(ji<xl> $$0, xp $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xp a(xp $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xp b(xp $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xl.a c(xp $$0) {
         return new xl.a(this.b, this.c, Optional.of($$0));
      }

      public ji<xl> a() {
         return this.b;
      }

      public xp b() {
         return this.c;
      }

      public Optional<xp> c() {
         return this.d;
      }
   }
}
