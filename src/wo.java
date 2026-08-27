import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wo(wp j, wp k) {
   public static final Codec<wo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wp.a.fieldOf("chat").forGetter(wo::a), wp.a.fieldOf("narration").forGetter(wo::b)).apply($$0, wo::new)
   );
   public static final wp b = wp.a("chat.type.text");
   public static final ake<wo> c = a("chat");
   public static final ake<wo> d = a("say_command");
   public static final ake<wo> e = a("msg_command_incoming");
   public static final ake<wo> f = a("msg_command_outgoing");
   public static final ake<wo> g = a("team_msg_command_incoming");
   public static final ake<wo> h = a("team_msg_command_outgoing");
   public static final ake<wo> i = a("emote_command");

   private static ake<wo> a(String $$0) {
      return ake.a(ld.az, new akf($$0));
   }

   public static void a(qj<wo> $$0) {
      $$0.a(c, new wo(b, wp.a("chat.type.text.narrate")));
      $$0.a(d, new wo(wp.a("chat.type.announcement"), wp.a("chat.type.text.narrate")));
      $$0.a(e, new wo(wp.b("commands.message.display.incoming"), wp.a("chat.type.text.narrate")));
      $$0.a(f, new wo(wp.c("commands.message.display.outgoing"), wp.a("chat.type.text.narrate")));
      $$0.a(g, new wo(wp.d("chat.type.team.text"), wp.a("chat.type.text.narrate")));
      $$0.a(h, new wo(wp.d("chat.type.team.sent"), wp.a("chat.type.text.narrate")));
      $$0.a(i, new wo(wp.a("chat.type.emote"), wp.a("chat.type.emote")));
   }

   public static wo.a a(ake<wo> $$0, bql $$1) {
      return a($$0, $$1.dN().H_(), $$1.O_());
   }

   public static wo.a a(ake<wo> $$0, ec $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wo.a a(ake<wo> $$0, jj $$1, ws $$2) {
      ji<wo> $$3 = $$1.d(ld.az);
      return new wo.a($$3.g($$0), $$2);
   }

   public wp a() {
      return this.j;
   }

   public wp b() {
      return this.k;
   }

   public static record a(iv<wo> b, ws c, Optional<ws> d) {
      public static final yq<wd, wo.a> a = yq.a(yo.b(ld.az), wo.a::a, wu.d, wo.a::b, wu.e, wo.a::c, wo.a::new);

      a(iv<wo> $$0, ws $$1) {
         this($$0, $$1, Optional.empty());
      }

      public ws a(ws $$0) {
         return this.b.a().a().a($$0, this);
      }

      public ws b(ws $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wo.a c(ws $$0) {
         return new wo.a(this.b, this.c, Optional.of($$0));
      }

      public iv<wo> a() {
         return this.b;
      }

      public ws b() {
         return this.c;
      }

      public Optional<ws> c() {
         return this.d;
      }
   }
}
